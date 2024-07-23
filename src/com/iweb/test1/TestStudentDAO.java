package com.iweb.test1;

import com.iweb.dao.StudentDAO;
import com.iweb.dao.lmpl.StudentDAOImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**测试类 用于DAO接口测试
 * @Test 将指定方法标记为测试方法 可以不依赖于main方法直接运行
 * @Before 在所有测试方法运行之前执行的代码 一般用于环境的初始化
 * @After 在所有测试方法运行后前执行的代码 一般用于资源回收
 * @author zzl
 * @date 2024/7/23 上午11:02
 */
public class TestStudentDAO {
    private StudentDAO studentDAO;
    @Before
    public void init(){
        studentDAO = new StudentDAOImpl();
    }
    @Test
    public  void testFindById(){
        //System.out.println(studentDAO.findById(1));
        Assert.assertNotNull(studentDAO.findById(1));
        //Assert.assertNotNull(null);
    }
    @Test
    public void testCount(){
        Assert.assertEquals(6L,(long)studentDAO.count());
    }
    @Test
    public void testFindAll(){
        Assert.assertNotNull(studentDAO.findAll());
    }
    @Test
    public void testfindByNameLike(){
        Assert.assertNotNull(studentDAO.findByNameLike("l"));
    }
    @Test
    public void testfindWithLimit(){
        Assert.assertNotNull(studentDAO.findWithLimit(1,2));
    }
    @Test
    public void testfinByNameLikeWithLimit(){
        Assert.assertNotNull(studentDAO.finByNameLikeWithLimit("l",0,1));
    }
}
