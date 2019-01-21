describe ("test site for input field on home page", function(){
	it("to enter username in the username field", function(){
		browser.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		browser.manage().timeouts().implicitlyWait(20000);
		element(by.model("Auth.user.name")).sendKeys("angular");
		element(by.model("Auth.user.password")).sendKeys("password");
		element(by.model("model[options.key]")).sendKeys("this is username and password page");
		element(by.buttonText("Login")).click();
		var guru= element(by.xpath('/html/body/div[3]/div/div/div/p[1]'));
		expect(guru.getText()).toEqual("You're logged in!!");
		
	})
});

/**
   * browser.ignoreSynchronization=true;
   * If true, Protractor will not attempt to synchronize with the page before
   * performing actions. This can be harmful because Protractor will not wait
   * until $timeouts and $http calls have been processed, which can cause
   * tests to become flaky. This should be used only when necessary, such as
   * when a page continuously polls an API using $timeout.
   *
   * @type {boolean}
   */