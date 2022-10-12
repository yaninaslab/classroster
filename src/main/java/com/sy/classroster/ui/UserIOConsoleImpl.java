/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sy.classroster.ui;

import java.util.Scanner;

/**
 *
 * @author yanina
 */
public class UserIOConsoleImpl implements UserIO {
    
    final private Scanner console = new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public double readDouble(String msg) {
        while(true) {
            try{
                return Double.parseDouble(this.readString(msg));
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }

    @Override
    public double readDouble(String msg, double min, double max) {
        double result;
         do{
             result = readLong(msg);
         }while(result < min || result > max);
         return result;
    }

    @Override
    public float readFloat(String msg) {
        while(true) {
            try{
                return Float.parseFloat(this.readString(msg));
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }

    @Override
    public float readFloat(String msg, float min, float max) {
        float result;
         do{
             result = readLong(msg);
         }while(result < min || result > max);
         return result;
    }

    @Override
    public int readInt(String msg) {
        boolean invalidInput = true;
        int num = 0;
        while(invalidInput) {
            try {
                String sValue = this.readString(msg);
                num = Integer.parseInt(sValue);
                invalidInput = false;
                
            } catch(NumberFormatException e) {
                this.print("");
            }
        }
        return num;
    }

    @Override
    public int readInt(String msg, int min, int max) {
        int result; 
        do{
            result = readInt(msg);
        }while(result < min || result > max);
        return result;
    }

    @Override
    public long readLong(String msg) {
        while(true) {
            try{
                return Long.parseLong(this.readString(msg));
            } catch (NumberFormatException e) {
                this.print("Input error. Please try again.");
            }
        }
    }

    @Override
    public long readLong(String msg, long min, long max) {
         long result;
         do{
             result = readLong(msg);
         }while(result < min || result > max);
         return result;
    }

    @Override
    public String readString(String msg) {
       this.print(msg);
       return console.nextLine();
    }
    
}
