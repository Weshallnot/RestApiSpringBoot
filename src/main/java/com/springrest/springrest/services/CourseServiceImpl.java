package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	
//	List<Course> list;
	 public CourseServiceImpl() {
		 
//		 list =new ArrayList<>();
//		 list.add(new Course(145,"Java core Course","This couse contain core java "));
//		 list.add(new Course(4343,"Spring boot Course ","This couse contain Spring boot "));
	 }
	
	
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}



	
	@Override
	public Optional<Course> getCourse(long courseId) {
		// TODO Auto-generated method stub
		
//		Course c=null;
//		for (Course course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.findById(courseId);
	}



	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course updatedCourse) {
//        for (int i = 0; i < list.size(); i++) {
//            Course course = list.get(i);
//            if (course.getId() == updatedCourse.getId()) {
//                list.set(i, updatedCourse);
//                return updatedCourse;
//            }
//        }
		
		courseDao.save(updatedCourse);
        return updatedCourse; 
    }



	
	@Override
	 public void deleteCourse(long courseId) {
//        Course courseToRemove = null;
//        for (Course course : list) {
//            if (course.getId() == courseId) {
//                courseToRemove = course;
//                list.remove(course);
//                break;
//            }
//        }
		
		courseDao.deleteById(courseId);
        // Return the deleted course or null if not found
    }

}
