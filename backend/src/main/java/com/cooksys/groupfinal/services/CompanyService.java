package com.cooksys.groupfinal.services;

import java.util.Set;

import com.cooksys.groupfinal.dtos.AnnouncementDto;
import com.cooksys.groupfinal.dtos.FullUserDto;
import com.cooksys.groupfinal.dtos.ProjectDto;
import com.cooksys.groupfinal.dtos.ProjectRequestDto;
import com.cooksys.groupfinal.dtos.TeamDto;

public interface CompanyService {

	Set<FullUserDto> getAllActiveUsers(Long id);

	Set<FullUserDto> getAllUsers(Long id);

	Set<AnnouncementDto> getAllAnnouncements(Long id);

	Set<TeamDto> getAllTeams(Long id);

	Set<ProjectDto> getAllProjects(Long companyId, Long teamId);

    ProjectDto updateProjectStatus(Long companyId, Long teamId, Long projectId, ProjectRequestDto projectRequestDto);

}
