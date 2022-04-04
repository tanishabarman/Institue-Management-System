package com.hr.bl.interfaces.managers;
import com.hr.bl.interfaces.pojo.*;
import com.hr.bl.exceptions.*;
import java.util.*;
public interface CoursesManagerInterface
{
public void addCourses(CoursesInterface course) throws BLException;
public void updateCourses(CoursesInterface course) throws BLException;
public void removeCourses(int code) throws BLException;
public CoursesInterface getCourseByCode(int code) throws BLException;
public CoursesInterface getCourseByTitle(String title) throws BLException;
public int getCoursesCount();
public boolean courseCodeExists(int code);
public boolean courseTitleExists(String title);
public Set<CoursesInterface> getCourses();
}