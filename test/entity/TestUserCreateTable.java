package entity;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestUserCreateTable {
	@Test
	public void testSchemaExport()
	{
		Configuration config =new Configuration().configure();
		SchemaExport export= new SchemaExport(config);
		export.create(true,true);
	}
}
