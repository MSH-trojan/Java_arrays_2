package main;

import java.util.Random;

public class Main{

public static void main(String[] args){

int[] L = new int[20];

Random value = new Random();

	System.out.print("Random Values are: {");

for(int i = 0; i < L.length; i++) {

L[i] = value.nextInt(20) + 1;
	System.out.print(L[i]);

if(i < L.length -1) {
	System.out.print(", ");

}}
	System.out.println("}");
}}