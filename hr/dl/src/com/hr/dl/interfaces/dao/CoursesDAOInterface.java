package com.hr.dl.interfaces.dao;
import com.hr.dl.interfaces.dto.*;
import com.hr.dl.exceptions.*;
import java.util.*;
public interface CoursesDAOInterface
{
public void add(CoursesDTOInterface courseDTO) throws DAOException;
public void update(CoursesDTOInterface courseDTO) throws DAOException;
public void delete(int code) throws DAOException;
public Set<CoursesDTOInterface> getAll() throws DAOException;
public CoursesDTOInterface getByCode(int code) throws DAOException;
public CoursesDTOInterface getByTitle(String title) throws DAOException;
public boolean codeExists(int code) throws DAOException;
public boolean titleExists(String title) throws DAOException;
public int getCount() throws DAOException;
}