using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Interactions;
using OpenQA.Selenium.Support.UI;

namespace FirstSelenium
{

    class OpenSaveEditor
    {
        IWebDriver driver;

        [SetUp]
        public void StartBrowser()
        {
            driver = new ChromeDriver(
                @"C:\Users\sdemewoz\Downloads\Chromedriver"); //chromedriver.exe should be in git and point to that folder
            driver.Manage().Cookies.DeleteAllCookies();
            driver.Manage().Window.Maximize();
            //driver.Manage().Timeouts().PageLoad = TimeSpan.FromSeconds(2);

        }

        [TearDown]
        public void CloseBrowser()
        {
           // driver.Close();
        }

        WebDriverWait wait;
        public void waitForById(string id)
        {
            if (wait == null)
                wait = new WebDriverWait(driver, new TimeSpan(0, 0, 20));

            //wait.Until(driver);
            wait.Until(d => d.FindElement(By.Id(id)));
        }

        public void OpenAlbelli()
        {
            //driver.Url = "https://www.albelli.nl/fotoboek-makenl";
           driver.Url = "https://editor.albelli.nl/html5/?articleType=PhotoBook&&papId=PAP_347#/editor";
           // driver.Url = "http://www.Albelli.nl";
            driver.Manage().Cookies.DeleteAllCookies();
            driver.Manage().Window.Maximize();
            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(30);
        }

        public void OpenBook()
        {
            //var element = driver.FindElement(By.id("element-id"));
            //Actions actions = new Actions(driver);
            //actions.MoveToElement(element);
            //actions.Perform();

            //in subscription page
            //IWebElement email = driver.FindElement(By.Id("email"));
            //  email.Click();
            //  email.SendKeys("selamawit.demewoz@albelli.com");
            //  IWebElement loginButton = driver.FindElement(By.Id("submit-om"));
            //  loginButton.Click();



            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(40);

            //IWebElement login = driver.FindElement(By.Id("loginButton"));
            //Assert.IsTrue(login.Displayed, "Login form is not displayed");


            //string myEmail = "seniselam21@gmail.com";
            //string myPassword = "seniselam";

            //IWebElement emailField = driver.FindElement(By.Id("loginButton"));
            //emailField.Click();
                //.SendKeys(myEmail)
            //driver.FindElement(By.Id("password")).SendKeys(myPassword);
            //driver.FindElement(By.Id("IsSessionPersistent")).Click();

            //driver.FindElement(By.Id("loginButton")).Click();

            //driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(30);

            //driver.FindElement(By.Id("photoCoverNo"));
            //driver.FindElement(By.Id("layflatNo"));
            //driver.FindElement(By.Id("upsellConfirmationButton"));

            //IWebElement noPhotoBook = driver.FindElement(By.Id("photoCoverNo"));
            //noPhotoBook.Click();
            //IWebElement noLayflat = driver.FindElement(By.Id("layflatNo"));
            //noLayflat.Click();
            //IWebElement okButton = driver.FindElement(By.Id("upsellConfirmationButton"));
            //okButton.Click();

        }

        [Test]
        public void OpenAndSaveAlbum()
        {
           OpenAlbelli();
           OpenBook();
        }
    }
}
