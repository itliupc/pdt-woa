package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.domain.RequestParam;
import com.cms.repository.RequestParamRepository;

@Service
public class RequestParamService {

	@Autowired
	RequestParamRepository requestParamRepository;

	public List<RequestParam> getRequestParamByInterfaceId(long interfaceId) {
		return requestParamRepository.getRequestParamByInterfaceId(interfaceId);
	}

	public void deleteRequestParamByRequestParamId(long requestParamId) {
		requestParamRepository.deleteRequestParamByRequestParamId(requestParamId);
	}

	public RequestParam findRequestParamById(long requestParamId) {
		return requestParamRepository.findRequestParamByRequestParamId(requestParamId);
	}

	public RequestParam saveRequestParam(RequestParam rP) {
		return requestParamRepository.save(rP);
	}
}
