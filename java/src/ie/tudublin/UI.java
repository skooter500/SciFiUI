package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
//import processing.core.PFont;

public class UI extends PApplet
{

    ArrayList<Suit> suits = new ArrayList<Suit>();
    ArrayList<Suit> suitInfo = new ArrayList<Suit>();

    Button b;

    Time time;

    Spider spider;

   
    //PFont myFont;

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
    
        loadSuits();
        printSuits();
        drawSuits();
       

    }

    public void loadSuits()
    {
        Table table = loadTable("suits.csv", "header");
        for(TableRow tr : table.rows())
        {
            /*Suit a = new Suit(tr);
            suits.add(a);
            */
            suits.add(new Suit(tr));
        }   

    }

    public void printSuits() 
    {
          for (Suit a : suits) 
          {
              System.out.println("Suit:" + a);
          }
    
    }

    public void drawSuits()
    {
        
    }

        /*public void drawSuits()
        { 
            // Draw the list of products
            float border = height * 0.1f;
            float start = width * 0.05f;
            float w = width * 0.3f;
            float h = height * 0.1f;
            //textAlign(LEFT, CENTER);
            //textSize(16);
            for(int i = 0 ; i < suits.size() ; i ++)
                {
                    Suit p = suits.get(i);
                    float y = map(i, 0, suits.size(), border, height - border);
                    fill(255);
                    rect(start, y, w, h);
                    fill(0);
                    textAlign(LEFT, CENTER);
                    text(p.getSuit(), start + 10, y + (h / 2));
                    textAlign(RIGHT, CENTER);
                    text(nf(0, 2), start + w - 10, y + (h / 2));
                } 
        }

        public void drawSuitInfo()
        {
            float border = height * 0.1f;
            float start = (width / 2) + width * 0.05f;
            float w = width * 0.4f;
            float h = height * 0.8f;
      
            stroke(0);
            fill(255);
            rect(start, border, w, h);
            fill(0);
            textAlign(CENTER, CENTER);
            text("Your Bill", (float) (width * 0.75), border + 20);
            float total = 0;
            float y = border + 50;
            float x = start + 10;
            float gap = 30;
            for(int i = 0 ; i < suit.size() ; i ++)
            {
                Suit p = suit.get(i);    
                textAlign(LEFT, CENTER);
                text(p.getName(), start + 10, y);
                textAlign(RIGHT, CENTER);
                text(nf(p.getPrice(), 0, 2), start + w - 10, y);
                y += gap;
                total += p.getPrice();
            }
            textAlign(LEFT, CENTER);
            text("Total:", x, y);
            textAlign(RIGHT, CENTER);
            text(nf(total, 0, 2), x + w - 20, y);  
        }*/
    
   

    

   /* public void mouseClicked()
    {
        int which = -1;

        // The best way!!
        if ((mouseX > border && mouseX < border + buttonWidth))
        {
            if ((mouseY - border) % (buttonHeight + gap) < buttonHeight)
            {
                which = (int) ((mouseY - border) / (buttonHeight + gap));
            }
        }

        
        if (which != -1)
        {
            System.out.println(suits.get(which));
        }
    }*/

  
    public void setup()
    {

        b = new Button(this, 50, 50, 100, 50, "Button");
        //mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, 850, 550, 120);// speed,x,y
        
        //time class
        time = new Time(this, 360, 600);//x.y

        spider = new Spider(this);

        //
        
    }

    Radar radar;

    public void draw()
    {
        background(159, 0, 0);
        
        //Drawing Layout
        rect(30, 40, 350, 300); //x,y,width,height
        rect(600, 40, 350, 300);

        spider.drawSpider();

        b.render();
        

        radar.update();
        radar.render();

        time.render();
        time.update();

        //myFont = createFont("Homoarakhn", 40);
        //fill(255);
        //textFont(myFont);
        text("SpiderMan", width / 2, 150);

        /*drawSuitButtons();*/


        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

