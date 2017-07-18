import greenfoot.*;

/**
 * Write a description of class bg_menu here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class bg_menu extends World
{
    private bt_mulai btmulai;
    private bt_about btabout;
    private bt_help bthelp;
    private bt_menu btmenu;
    private bg_game bggame;
    private map1 Map1;
    private M1_0_0 m1_0_0;
    private M1_0_300 m1_0_300;
    private M1_80_400 m1_80_400;
    private M1_80_425 m1_80_425;
    private M1_150_300 m1_150_300;
    private M1_160_50 m1_160_50;
    private M1_165_0 m1_165_0;
    private M1_200_100 m1_200_100;
    private M1_200_250 m1_200_250;
    private M1_275_100 m1_275_100;
    private M1_275_125 m1_275_125;
    private M1_275_175 m1_275_175;
    private M1_325_225 m1_325_225;
    private M1_375_75 m1_375_75;
    private M1_425_250 m1_425_250;
    private M1_500_50 m1_500_50;
    private M1_500_75 m1_500_75;
    private M1_575_100 m1_575_100;
    private M1_575_300 m1_575_300;
    private M1_700_100 m1_700_100;

    private enum appState{MENU};
    private appState state;

    
    /**
     * Constructor for objects of class bg_menu.
     * 
     */
    public bg_menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        bt_mulai bt_mulai = new bt_mulai();
        addObject(bt_mulai, 712, 334);
        bt_mulai.setLocation(501, 277);
        bt_help bt_help = new bt_help();
        addObject(bt_help, 317, 291);
        bt_mulai.setLocation(510, 290);
        bt_about bt_about = new bt_about();
        addObject(bt_about, 693, 294);
        bt_mulai.setLocation(504, 284);
        bt_about.setLocation(684, 287);
        bt_help.setLocation(319, 286);
        bt_about.setLocation(683, 286);
        bt_about.setLocation(683, 286);
        bt_mulai.setLocation(504, 319);
        bt_help.setLocation(358, 250);
        bt_about.setLocation(662, 253);
        bt_mulai.setLocation(509, 321);
        
        state = appState.MENU;
    }
    
    public void act()
    {
        switch(state)
        {
            case MENU:
            {
                actMenu();
                break;
            }
            
        }
    }
    
    private void actMenu()
    {
        if(Greenfoot.mouseClicked(btmulai))
        {
            openGame();
        }
        
        else if(Greenfoot.mouseClicked(btabout))
        {
            //openAbout();
        }
        
        else if(Greenfoot.mouseClicked(bthelp))
        {
            //openHelp();
        }
    }
    
    private void openGame()
    {
        removeObjects(getObjects(Actor.class));
        
        bggame = new bg_game();
        addObject(bggame,500,250);
        
        m1_0_0 = new M1_0_0();
        addObject(m1_0_0,84,136);
        
        m1_0_300 = new M1_0_300();
        addObject(m1_0_300,61,401);
        
        m1_150_300 = new M1_150_300();
        addObject(m1_150_300,176,337);
        
        m1_160_50 = new M1_160_50();
        addObject(m1_160_50,321,61);
        
        m1_165_0 = new M1_165_0();
        addObject(m1_165_0,481,26);
        
        m1_200_100 = new M1_200_100();
        addObject(m1_200_100,213,174);
        
        m1_200_250 = new M1_200_250();
        addObject(m1_200_250,298,312);
        
        m1_275_100 = new M1_275_100();
        addObject(m1_275_100,124,375);
        
        
    }
}
