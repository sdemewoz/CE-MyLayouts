using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using NUnit.Framework;
using OpenQA.Selenium.Html5;
using OpenQA.Selenium.Interactions;

namespace FirstSelenium
{
    class Test
    {
        IWebDriver driver;

        [SetUp]
        public void StartBrowser()
        {
            driver = new ChromeDriver(@"C:\Users\sdemewoz\Downloads"); //chromedriver.exe should be in git and point to that folder
            driver.Manage().Cookies.DeleteAllCookies();
            driver.Manage().Window.Maximize();
            //driver.Manage().Timeouts().PageLoad = TimeSpan.FromSeconds(2);
        }

        [Test]
        public void RunTests()
        {
            OpenGoogle();
            SearchAlbelli();
        }
        
        public void OpenGoogle()
        {
            driver.Url = "http://www.google.com";
        }

        public void SearchAlbelli()
        {
            string searchText = "albelli";
            driver.FindElement(By.Name("q")).SendKeys(searchText);
            driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(30);
            //driver.FindElement(By.Name("btnK")).Click(); //error b/c it is not clickable. dont know why

            //press enter to search
            Actions action = new Actions(driver);
            action.SendKeys(OpenQA.Selenium.Keys.Enter).Build().Perform();

            // checks if the result contains the searchText
            IWebElement result = driver.FindElement(By.Id("search"));
            Assert.IsTrue(result.Text.Contains(searchText), "Albelli is not found");
        }

        [TearDown]
        public void CloseBrowser()
        {
            driver.Close();
        }
    }
}
