package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Guide;
import entity.Student;
import util.HibernateUtil;


public class Task1Client {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		Transaction txn = session.getTransaction();
        		try {
        			txn.begin();
        			
					// persisting a new Student (using CascadeType.PERSIST) after associating it with Guide[id=2L] 	
        			/*
        			Guide guide = (Guide) session.get(Guide.class, 2L);
					Student student = new Student("2014JE10333", "Jane Roe", guide);

					session.persist(student);
					*/
							 
        			
					// deleting Student[id=2L] (using CascadeType.REMOVE)
        			/*
        			Student student = (Student) session.get(Student.class, 2L);
        			session.delete(student);
        			*/
        			
					// deleting Student[id=2L] after disassociating itself from it's Guide
        			
        			Student student = (Student) session.get(Student.class, 2L);
        			Guide guide = (Guide) session.get(Guide.class, 2L);
        			//student.setGuide(guide);
        			guide.getStudents().add(new Student());
    
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(session != null) { session.close(); }
        		}
	
	}
}



