package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartamentService {
	
	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(1,"ACADEMIA GMC"));
		list.add(new Department(2,"BASE NORTE"));
		list.add(new Department(3,"BASE CENTRO"));
		list.add(new Department(4,"BASE OESTE"));
		list.add(new Department(5,"BASE AMBIENTAL"));
		list.add(new Department(6,"BASE RURAL"));
		list.add(new Department(7,"BASE IAE"));
		list.add(new Department(8,"ILP"));
		list.add(new Department(9,"IMCMB"));
		list.add(new Department(10,"IMV"));
		list.add(new Department(11,"IRH"));
		list.add(new Department(12,"INSPETORIA ESCOLAR"));
		list.add(new Department(13,"PROIN"));
		list.add(new Department(14,"ROMU"));
		list.add(new Department(15,"CECOM"));
		list.add(new Department(16,"CIMCAMP"));
		list.add(new Department(17,"CORREGEDORIA"));
		list.add(new Department(18,"SPPC"));
		list.add(new Department(19,"PAÇO MUNICIPAL"));
		list.add(new Department(20,"SUPERINTENDÊNCIA GERAL"));
		list.add(new Department(21,"SUPERINTENDÊNCIA ADM"));
		list.add(new Department(22,"SUPERINTENDÊNCIA OPERACIONAL"));
		list.add(new Department(23,"SUPERINTENDÊNCIA PLANEJAMENTO"));
		list.add(new Department(24,"SUPERINTENDÊNCIA INTELIGÊNCIA"));
		list.add(new Department(25,"SUB COMANDO GMC"));
		list.add(new Department(26,"COMANDANTE GMC"));
		list.add(new Department(27,"SMCASP"));
		list.add(new Department(28,"DIRETORIA ADM - SMCASP"));
		list.add(new Department(29,"OUTROS DEPARTAMENTO PMC"));
		return list;
				
		
	}

}
