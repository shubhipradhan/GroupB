package com.som.Group.dao;

import java.util.List;

import com.som.Group.model.Job;

public interface JobDAO {

	public boolean saveOrUpdate(Job job);
	public boolean delete(Job job);
    public List<Job> list();
}
