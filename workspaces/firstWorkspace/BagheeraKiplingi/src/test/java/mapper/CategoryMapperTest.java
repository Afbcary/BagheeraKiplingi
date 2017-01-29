package mapper;

import static org.junit.Assert.assertEquals;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import db.ConnectionFactory;
import models.Category;

public class CategoryMapperTest {

	private static final int CATEGORY_ID = 1;
	private static final String APPAREL = "Apparel";
	private CategoryMapper mapper;
	private SqlSession session;

	@Before
	public void setup() {
		session = ConnectionFactory.getSqlSessionFactory().openSession();
		mapper = session.getMapper(CategoryMapper.class);
	}

	@After
	public void cleanup() {
		session.close();
	}

	@Test
	public void testGetFirstCategory() {
		Category category = mapper.getCategory(CATEGORY_ID);
		assertEquals(CATEGORY_ID, category.getCategoryId());
		assertEquals(APPAREL, category.getCategoryName());
	}

	@Test
	public void testGetCategoryName() {
		String name = mapper.getCategoryName(CATEGORY_ID);
		assertEquals(APPAREL, name);
	}

}
