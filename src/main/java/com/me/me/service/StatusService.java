package com.me.me.service;

import com.me.me.DTO.StatusDTO;
import com.me.me.DTO.StatusRetornoDTO;

public interface StatusService {

	StatusRetornoDTO retornaStatus(StatusDTO status);
}
