package com.example.demo.data;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CdUnitTests {
	 
	
    @Test
    public void constructor_TEST(){
        Cd object = new Cd();

         
        assertTrue(object instanceof Cd);
    }

    
    @Test
    public void getID_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);

        // expectation, result
        assertEquals(1, object.getId());
    }
	
	@Test
    public void setID_TEST(){
        Cd object = new Cd(2,"space",2020,"dave smith","rock",12.50);
        
        object.setId(1);
        
        // expectation, result
        assertEquals(1, object.getId());
    }
	
	@Test 
    public void getCd_name_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);

        // expectation, result
        assertEquals("space", object.getCd_name());
    }
	
	@Test
    public void setCd_name_TEST(){
        Cd object = new Cd(2,"space",2020,"dave smith","rock",12.50);
        
        object.setCd_name("raider");
        
        // expectation, result
        assertEquals("raider", object.getCd_name());
    }
	
	@Test 
    public void getYear_released_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);

        // expectation, result
        assertEquals(2020, object.getYear_released());
    }
	 
	@Test
    public void setYear_released_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);
        
        object.setYear_released(2019);
        
        // expectation, result
        assertEquals(2019, object.getYear_released());
    }
	
	@Test 
    public void getArtist_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);

        // expectation, result
        assertEquals("dave smith", object.getArtist());
    }
	 
	@Test
    public void setArtist_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);
        
        object.setArtist("john jones");
        
        // expectation, result
        assertEquals("john jones", object.getArtist());
    } 
	
	@Test 
    public void getGenre_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);

        // expectation, result
        assertEquals("rock", object.getGenre());
    }
	 
	@Test
    public void setGenre_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);
        
        object.setGenre("jazz");
        
        // expectation, result
        assertEquals("jazz", object.getGenre());
    }
	
	@Test  
    public void getPrice_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);

        // expectation, result
        assertEquals(12.50, object.getPrice());
    }
	 
	@Test
    public void setPrice_TEST(){
        Cd object = new Cd(1,"space",2020,"dave smith","rock",12.50);
        
        object.setPrice(10.00);
        
        // expectation, result
        assertEquals(10.00, object.getPrice());
    }

	
	
}
