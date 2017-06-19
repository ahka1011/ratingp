package com.rating.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.rating.domain.Kursvorlage;
import com.rating.domain.Professor;
import com.rating.domain.Student;

@Path("/courses")
public class CourseResource extends BaseResource {

	static HashMap<String,List<CourseDetailStudent>> izkuerzelStudent2courseDetail = new HashMap<String,List<CourseDetailStudent>>();
	static HashMap<String,List<CourseOverviewProfessor>> izkuerzelProfessor2courseDetail = new HashMap<String,List<CourseOverviewProfessor>>();
	class CourseDetailStudent {
		int id;
		String name;
		String izKuerzel;
		List<Student> studenten;
		
		Professor prof;
		
		public CourseDetailStudent(String kurs_nr, String iz_kuerzel)
		{
			Kursvorlage k = DatabaseConnector.kursInfo(kurs_nr);
			prof = new Professor();
			prof = DatabaseConnector.profInfo(iz_kuerzel);
			studenten = new ArrayList<Student>();
			studenten = DatabaseConnector.studentenZuKursSuchen(izKuerzel);
			id = k.getKurs_nr();
		}
	}
	class CourseOverviewProfessor{
		List<CourseDetailProfessor> kurse;
		Professor prof;
		public CourseOverviewProfessor(String iz_kuerzel)
		{
			kurse = new ArrayList<CourseDetailProfessor>();
			prof = DatabaseConnector.profInfo(iz_kuerzel);
		}
		
	}
	class CourseDetailProfessor {
		int id;
		String name;
		String izKuerzel;
		List<Student> studenten;
		
		Professor prof;
		
		public CourseDetailProfessor(String iz_kuerzel, String kurs_nr)
		{
			Kursvorlage k = DatabaseConnector.kursInfo(kurs_nr);
			prof = new Professor();
			prof = DatabaseConnector.profInfo(iz_kuerzel);
			studenten = new ArrayList<Student>();
			studenten = DatabaseConnector.studentenZuKursSuchen(izKuerzel);
			id = k.getKurs_nr();
		}
	}
	
	@GET
	@Produces("application/json")
	@Path("/")
	static List<CourseDetailStudent> getCourseDetailsStudent(@HeaderParam("token") String token, @QueryParam("id") String id){
		try {
			if(isValid(token)){
				List<CourseDetailStudent> c = izkuerzelStudent2courseDetail.get(id);
				return c;
			} else {
				return null; 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@GET
	@Produces("application/json")
	@Path("/")
	static List<CourseOverviewProfessor> getCourseDetailsProfessor(@HeaderParam("token") String token, @QueryParam("id") String id){
		try {
			if(isValid(token)){
				List<CourseOverviewProfessor> c = izkuerzelProfessor2courseDetail.get(id);
				return c;
			} else {
				return null; 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}
	@POST
	@Produces("application/json")
	@Path("/")
	static void postKursAnlegen(@HeaderParam("token") String token, @FormParam("kursName") String kursName, @FormParam("semester") String semester, @FormParam("kuerzel") String kuerzel){
		try {
			if(isValid(token)){
				DatabaseConnector.kursAnlegen(kursName, semester, kuerzel);
				
			} 
				
			
		} catch (Exception e) {
			//ToDo hier müsst ihr festlegen was passiert wenn das Token nicht valide ist.  
			e.printStackTrace();
		}
	
	}
	
	@GET
	@Produces("application/json")
	@Path("/")
	static List<Student> getStudentenZuKursSuchen(@HeaderParam("token") String token, @QueryParam("gruppen_nr") String gruppen_nr){
		List<Student> c = null;
		try {
			if(isValid(token)){
				c = DatabaseConnector.studentenZuKursSuchen(gruppen_nr);
				return c;
			} else {
				return c; 
			}
		} catch (Exception e) {
			//ToDo hier müsst ihr festlegen was passiert wenn das Token nicht valide ist.  
			e.printStackTrace();
		}
		return c;
	
	}
	
	@GET
	@Produces("application/json")
	@Path("/")
	static List<Kursvorlage> getSudentKursListeSuchen(@HeaderParam("token") String token, @QueryParam("iz_kuerzel") String iz_kuerzel){
		List<Kursvorlage> c = null;
		try {
			if(isValid(token)){
				c = DatabaseConnector.studentKursListeSuchen(iz_kuerzel);
				return c;
			} else {
				return c; 
			}
		} catch (Exception e) {
			//ToDo hier müsst ihr festlegen was passiert wenn das Token nicht valide ist.  
			e.printStackTrace();
		}
		return c;
	
	}
}

