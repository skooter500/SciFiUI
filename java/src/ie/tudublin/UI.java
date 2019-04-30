package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;



public class UI extends PApplet
{
    //Creating Array Lists
    ArrayList<Suit> suits = new ArrayList<Suit>();
    ArrayList<Suit> suitInfo = new ArrayList<Suit>();
    
    int val;

    //Declaring objects
    Radar radar;
    Radar radar2;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;

    Time time;
    Spider spider;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(1000, 700);
        
        //Loading Method
        loadSuits();   
    }
    
    /*Constructing new suit Instances and populating in suit Array List */

    public void loadSuits()
    {
        Table table = loadTable("suits.csv", "header");
        for(TableRow tr : table.rows())
        {
            Suit a = new Suit(tr);
            suits.add(a);     
    
        }   

    }
    
    /**
     * printSuitInfo
     * This method is use to display each data title 
     * @param j
     */

    public void printSuitInfo(int j)
    {   

        for (int i = 0; i < suits.size(); i++) {
            text(suits.get(j).getSuit(),750, 60);
            text(suits.get(j).getAttack(),750,100);
            text(suits.get(j).getHealth(),750,140);
            text(suits.get(j).getArmor(),750,180);
            text(suits.get(j).getStealth(),750,220);
            text(suits.get(j).getAgility(),750,260);
        }
    }

    /**
     * mouseClicked()
     * This method is invoked when you click a certain button.
     */
    public void mouseClicked()
    {
        //Checks if mouse position is inside the rectangle containing buttons
        if(mouseX > 30 && mouseX < 380 && mouseY > 40 && mouseY < 340 )
        {
            //Checks if mouse position is within the range of Classic Suit
            if(mouseX > 50 && mouseX < 200 && mouseY > 50 && mouseY < 125 )
            {
               suitInfo.add(suits.get(0));
               val = 0;
            }
            //Checks if mouse position is within the range of Noir Suit
            if(mouseX > 215 && mouseX < 365 && mouseY > 50 && mouseY < 125 )
            {
                suitInfo.add(suits.get(1));
                val = 1;
                
            }
            //Checks if mouse position is within the range of Stealth Suit
            if(mouseX > 50 && mouseX < 200 && mouseY > 150 && mouseY < 225 )
            {
                suitInfo.add(suits.get(2));
                val = 2;
            }
            //Checks if mouse position is within the range of Iron Spider Suit
            if(mouseX > 215 && mouseX < 365 && mouseY > 150 && mouseY < 225 )
            {
                suitInfo.add(suits.get(3));
                val = 3;
            }
            //Checks if mouse position is within the range of Mark IV Suit
            if(mouseX > 50 && mouseX < 200 && mouseY > 250 && mouseY < 325 )
            {
                suitInfo.add(suits.get(4));
                val = 4;
            }
        }

    }

    public void setup()
    {
        b1 = new Button(this, 50, 50, 150, 75, "Classic Suit");
        b2 = new Button(this, 215, 50, 150, 75, "Noir Suit");
        b3 = new Button(this, 50, 150, 150, 75, "Stealth Suit");
        b4 = new Button(this, 215, 150, 150, 75, "Iron Spider Suit");
        b5 = new Button(this, 50, 250, 150, 75, "Mark IV Suit");
        

        radar = new Radar(this, 1, 850, 550, 120);// speed,x,y,radius
        radar2 = new Radar(this, 1, 150, 550, 120);// speed,x,y
        
        //time class
        time = new Time(this, 360, 600);//x.y

        spider = new Spider(this);

    }

    public void draw()
    {
        background(159, 0, 0);
        
       
        //Drawing Layout
        fill(255);
        stroke(0);
        rect(30, 40, 350, 300); //x,y,width,height
        rect(600, 40, 350, 300);

        fill(0);
        text("Suit:",640,60);
        text("Attack:",640,100);
        text("Health:",640,140);
        text("Armor:",640,180);
        text("Stealth:",640,220);
        text("Agility:",640,260);
        
        //Invoke method to drawSpider
        spider.drawSpider();

        b1.render();
        b2.render();
        b3.render();
        b4.render();
        b5.render();
        
        //Invoke method to draw Radars
        fill(0);
        text("Spidey Sense",850,400);
        radar.update();
        radar.render();
        
        text("Spidey Sense",150,400);
        radar2.update();
        radar2.render();

        //Invoke method to generate time
        time.render();
        time.update();
        
        text("SpiderMan", width / 2, 150);


        printSuitInfo(val);

    }
}

