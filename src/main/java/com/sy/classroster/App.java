/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sy.classroster;

import com.sy.classroster.controller.ClassRosterController;
import com.sy.classroster.dao.ClassRosterDao;
import com.sy.classroster.dao.ClassRosterDaoFileImpl;
import com.sy.classroster.ui.ClassRosterView;
import com.sy.classroster.ui.UserIO;
import com.sy.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author yanina
 */
public class App {
    
    public static void main(String[] args) {
    UserIO myIo = new UserIOConsoleImpl();
    ClassRosterView myView = new ClassRosterView(myIo);
    ClassRosterDao myDao = new ClassRosterDaoFileImpl();
    ClassRosterController controller =
            new ClassRosterController(myDao, myView);
    controller.run();
}
    
}
