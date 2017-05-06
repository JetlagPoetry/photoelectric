package basedao;

	import java.io.Serializable;
	import java.util.List;

	public interface BaseDao<T>{
		 void saveEntity(T t);
		 void updateEntity(T t);
		 void deleteEntity(T t) ;
		 void deleteEntityById(Serializable id);
		 T loadEntity(Class<T> class1,Serializable id);
	     T loadEntity(final Serializable id);
		 List<T> loadListEntitys();
		 List<T> loadListEntitys(String where,Object ...params);
		 
	}

