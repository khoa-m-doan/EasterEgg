package edu.uw.tacoma.piggy.model.dao;

import java.util.List;

import edu.uw.tacoma.piggy.model.entity.CategoryEntity;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * The test case for the category DAO
 * @author Varik Hoang
 */
public class CategoryDAOTest
extends TestCase
{
	public void testListCategory()
	{
		List<CategoryEntity> list = CategoryDAO.listCategory();
		Assert.assertEquals("The test list category method failed ", 3, list.size());
	}
	
	public void testListCategoryID()
	{
		List<CategoryEntity> list = CategoryDAO.listCategory("ID", "0");
		Assert.assertEquals("The test list category method failed ", 1, list.size());
	}
}