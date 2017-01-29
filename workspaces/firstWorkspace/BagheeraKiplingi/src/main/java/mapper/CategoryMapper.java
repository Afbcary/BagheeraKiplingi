package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import models.Category;

public interface CategoryMapper {

	@Select("SELECT category_name, category_id FROM category WHERE category_id = #{id}")
	Category getCategory(@Param("id") int id);

	@Select("SELECT category_name FROM category WHERE category_id = #{id}")
	String getCategoryName(@Param("id") int id);
}
