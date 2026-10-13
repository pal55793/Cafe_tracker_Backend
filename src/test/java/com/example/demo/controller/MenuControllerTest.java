package com.example.demo.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.service.MenuService;

@ExtendWith(MockitoExtension.class)
public class MenuControllerTest {
	
	 @Mock
	    private MenuService menuService;

	    @InjectMocks
	    private MenuController menuController;

}
