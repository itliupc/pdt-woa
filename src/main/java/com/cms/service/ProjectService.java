package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.domain.Project;
import com.cms.repository.ProjectRepository;
import com.cms.vo.ProjectVo;

@Service
public class ProjectService {

  @Autowired
  private ProjectRepository projectRepository;

  public List<ProjectVo> getProjectList(){
    return projectRepository.getProjectList();
  }

  public List<ProjectVo> getProjectByDeptId(long deptId) {
    return projectRepository.getProjectByDeptId(deptId);
  }

  public void projectSave(Project project) {
    projectRepository.save(project);
  }

  public void deleteProjectByProjectId(long projectId) {
    projectRepository.delete(projectId);
  }

  public Project getProjectByProjectId(long projectId) {
    return projectRepository.findOne(projectId);
  }

}
