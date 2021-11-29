package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.windows.WindowsDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pageObjects.calculator.CalculatorPage;
import pageObjects.toDoLIst.TodoPage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

    //general
    protected static WebDriver driver;
    protected static Actions action;
    //put the url in xml
    protected static String url;

    //web
    protected static WebDriverWait wait;

    //Rest API
    protected static RequestSpecification request;
    protected static Response response;
    protected static JSONObject parames;
    protected static JsonPath jp;

    //assert
    protected static SoftAssert softassert;

    //oop
    //protected static RioPage rioPage;

    //appium start
    //driver
    protected static AndroidDriver<AndroidElement> androidDriver;


    //NAmes and urls
    protected static final String MOBILE_NAME = "RF8N21R48PA";
    protected static final String APP_PACKAGE_NAME = "com.shivgadhia.android.ukMortgageCalc";
    protected static final String MAIN_ACTIVITY = ".MainActivity";
    protected static final String APPIUM_URL = "http://localhost:4723/wd/hub";

    //Desired Capabilities
    protected static DesiredCapabilities dc = new DesiredCapabilities();

    //po pages
    protected static CalculatorPage calculatorPage;
//appium end

    //desktop
    protected static WindowsDriver driverdesktop;
    protected static DesiredCapabilities capabilities;

    //elektron start
    protected static WebDriver electronWebDriver;
    protected static ChromeOptions opt;
    protected static DesiredCapabilities electronCapabilities;

    protected static String DRIVER_LOCATION = "C:/Automation/electronDriver/electrondriver.exe";
    protected static String CHROME_DRIVER = "webdriver.chrome.driver";
    protected static String TODO_EXE_LOCATION = "C:\\Users\\jondi\\AppData\\Local\\Programs\\todolist\\Todolist.exe";
    protected static String CHROME_OPTIONS_STRING = "chromeOptions";
    protected static String CHROME = "chrome";

    //po
    protected static TodoPage todoPage;
    protected static int expectedAmountofTodos = 4;
    public static int expectedAmountofTodosAfterDelete = 3;
    protected static String expectedEditedTitle = "Edited first goal";


    //electron End


    //JDBC
    static String dbUrl = "jdbc:mysql://remotemysql.com:3306/Y8Nkn2FnBq";
    static String username = "Y8Nkn2FnBq";
    static String password = "kLrc4xtpod";
    static ResultSet rs;
    static Connection con;
    static Statement stmt;

}
