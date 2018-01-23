package com.maven.dao;

import com.maven.entity.StudentClass;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2018/1/17.
 */
@Repository("studentClassDao")
@Transactional(propagation = Propagation.REQUIRED)
public class StudentClassDao extends BaseDao{

    //增加班级
    public boolean addStudentClass(StudentClass scls){
        try {
            getSession().save(scls);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //删除班级
    public boolean deleteStudentClass(StudentClass stuc){
        try {
            getSession().delete(stuc);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //修改班级
    public boolean updateStudentClass(StudentClass stuc){
        try {
            getSession().update(stuc);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //查询班级
    public StudentClassDao findStudentClassById(int id){
        return getSession().get(StudentClassDao.class,id);
    }
    public List findStudentClassList(String hql){
        return getSession().createQuery(hql).list();
    }

}
