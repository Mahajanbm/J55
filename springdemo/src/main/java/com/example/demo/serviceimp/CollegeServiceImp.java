package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;
import com.example.demo.service.CollegeService;
@Service
public class CollegeServiceImp implements CollegeService
{
	CollegeRepository collegeRepository;

	public CollegeServiceImp(CollegeRepository collegeRepository) {
		super();
		this.collegeRepository = collegeRepository;
	}

	@Override
	public College addData(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public List<College> GetData() {
		// TODO Auto-generated method stub
		List<College> l1=collegeRepository.findAll();
		return l1;
	}

	@Override
	public College updateData(College college) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
