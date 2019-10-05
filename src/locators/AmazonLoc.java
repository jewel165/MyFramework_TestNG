package locators;

public class AmazonLoc {

	//SIgn-in/Sign-out/Account related
	public String Account= "//*[@id=\"nav-signin-tooltip\"]/a/span";
	public String Log_email ="//*[@id=\"ap_email\"]";
	public String Log_cont = "//*[@id=\"continue\"]";
	public String Log_Pass = "//*[@id='ap_password']";
	public String signin = "//*[@id=\'signInSubmit\']";
	public String crtacc= "//*[@id=\'createAccountSubmit\']";
	public String AccHolder = "//*[@id=\"nav-link-accountList\"]/span[1]";
	public String NavMenu = "//*[@id=\"nav-hamburger-menu\"]/i";
	public String SnOutBtn = "//*[@id=\"hmenu-content\"]/ul[35]/li[46]/a/div";
	
	//Search Related
	public String srcbar = "//*[@id=\'twotabsearchtextbox\']";
	public String scr = ".nav-search-submit > input:nth-child(2)";
	public String searchbutton ="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input";
	public String srcressult ="/html/body/div[1]/div[1]/span[2]/h1/div/div[1]/div/div/span[3]";

	//Homepage Related
	public String Logo = "//*[@id=\"nav-logo\"]/a[1]/span[1]";
	

	
}
