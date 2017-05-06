package basedao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class BaseDaoImpl<T> implements BaseDao<T> {
	private Configuration config;
	private ServiceRegistry serreg;
	private SessionFactory factory;
	private Session session;
	private  Transaction trans;
	private  Class<T> cls;

	public BaseDaoImpl() {
		// TODO Auto-generated constructor stub
		this.config=new Configuration().configure();
		this.serreg=new ServiceRegistryBuilder().applySettings(this.config.getProperties()).buildServiceRegistry();	
	    this.factory=this.config.buildSessionFactory(serreg);
	    this.session=this.factory.openSession();
	     this.cls=(Class<T>)((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
	}

	@Override
	public void saveEntity(T t) throws HibernateException {
		// TODO Auto-generated method stub
		
		try {
			this.trans=this.session.beginTransaction();
			this.session.save(t);
			this.trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.trans.rollback();
			throw e;
		}finally{
			if(this.session!=null)
				this.session.close();
		}
		
	}

	@Override
	public void updateEntity (T t) throws HibernateException {
		// TODO Auto-generated method stub
		try {
			this.trans=this.session.beginTransaction();
			this.session.update(t);
			this.trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.trans.rollback();
			throw e;
		}finally{
			if(this.session!=null)
				this.session.close();
		}
		
	}

	@Override
	public void deleteEntity(T t)  throws HibernateException{
		// TODO Auto-generated method stub
		try {
			this.trans=this.session.beginTransaction();
			this.session.delete(t);
			this.trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.trans.rollback();
			throw e;
		}finally{
			if(this.session!=null)
				this.session.close();
		}
		
		
	}

	@Override
	public void deleteEntityById(Serializable id) {
		
		this.deleteEntity(this.loadEntity(id));
		
	}

	@Override
	public T loadEntity(Class<T> class1, Serializable id) {
		
		try {
			T t=(T)this.session.get(class1, id);
			return t;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	@Override
	public T loadEntity(Serializable id) {
		try {
			T t=(T)this.session.get(this.cls, id);
			return t;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	@Override
	public List<T> loadListEntitys() {
		// TODO Auto-generated method stub
		try {
			Query query=this.session.createQuery("from "+this.cls.getSimpleName());
			return (List<T>)query.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	@Override
	public List<T> loadListEntitys(String where, Object... params) {
		// TODO Auto-generated method stub
		try {
			Query query=this.session.createQuery("from "+this.cls.getSimpleName()+" "+where);
			for(int i=0;i<params.length;i++)
				query.setParameter(i, params[i]);
			return (List<T>)query.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		return null;
	}

}
