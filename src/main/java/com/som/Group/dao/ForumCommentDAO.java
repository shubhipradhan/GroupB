package com.som.Group.dao;

import java.util.List;

import com.som.Group.model.ForumComment;



public interface ForumCommentDAO {

	public boolean saveOrUpdate(ForumComment forumcomment);
	public boolean delete(ForumComment forumcomment);
	public List<ForumComment> list(int fid);
}
