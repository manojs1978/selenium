module.exports = async function(context, commands) {
  context.log.info('Info logging from your script');
  context.log.error('Error logging from your script');



const EventEmitter = require('events');

class MyEmitter extends EventEmitter {}

const myEmitter = new MyEmitter();
// increase the limit
myEmitter.setMaxListeners(100);



//process.setMaxListeners(100);
var rn = require('random-number');
var gen = rn.generator({
  min:  1
, max:  10000000
, integer: true
})

var rnumber = require('random-number');
var gen1 = rnumber.generator({
  min:  1
, max:  10000000
, integer: true
})

  const webdriver = context.selenium.webdriver;

  const driver = context.selenium.driver;
 
  await commands.measure.start('http://inde5539.eaas.amdocs.com:40102/content/digitalexp/flow/login-menu.html');


  await commands.measure.start('http://inde5539.eaas.amdocs.com:40102/content/digitalexp/flow/shop-menu.html');
await commands.wait.byTime(5000)
  await commands.measure.start('devicelist');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[2]/section/div/div/div/div/a[1]')


await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/div/section/div[2]/div/div/ul/li[2]/div/div[1]/figure/div/img', 15000)
await commands.wait.byTime(5000)

  await commands.measure.stop();


await commands.measure.start('devicedetails');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/div/section/div[2]/div/div/ul/li[3]/div/div[1]/figure/div/img')

//await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/section/div[1]/section/button', 5000)

//await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/section/div[2]/button', 5000)

//await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/section/div[1]/section/button', 5000)


await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/section/div[2]/button', 5000)
await commands.measure.stop();

await commands.wait.byTime(5000)


await commands.measure.start('choosePlan');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/section/div[2]/button')
//await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/section/div[1]/section/button')
await commands.wait.byTime(8000)

await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/section/div[1]/div/div[3]/div/div/section/section/button/span')

await commands.wait.byTime(8000)
await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/div/div/div[2]/section/div[2]/div/div/ul/li[6]/div/div[4]/button', 15000)

await commands.wait.byTime(5000)
await commands.measure.stop();


await commands.measure.start('productconf');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/div/div/div[2]/section/div[2]/div/div/ul/li[7]/div/div[4]/button/span')
await commands.wait.byXpath('/html/body/section/div[1]/div[2]/div/div/button', 15000)
await commands.wait.byTime(5000)
await commands.measure.stop();



await commands.measure.start('BringMyNumber');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[2]/div/div/button')
await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[5]/div[1]/div[1]/div/div/div/div/ul/li[2]/label/span[2]/span', 5000)
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[5]/div[1]/div[1]/div/div/div/div/ul/li[2]/label/span[2]/span')

await commands.wait.byXpath('/html/body/section/div[1]/div[2]/div/div/button', 7000)
await commands.wait.byTime(5000)
await commands.measure.stop();


await commands.measure.start('cart');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[2]/div/div/button')
await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/div[2]/div[1]/footer/button[1]/span', 5000)
await commands.wait.byTime(5000)
await commands.measure.stop();



await commands.measure.start('createCustomer');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/div[2]/div[1]/footer/button[1]/span')
await commands.wait.byXpath('/html/body/section/div[1]/div[2]/div/div[2]/button/span', 15000)
await commands.wait.byTime(5000)
await commands.measure.stop();




await commands.measure.start('deliveryOption');

driver.findElement(webdriver.By.xpath("//input[@name='owningIndividual.firstName']")).sendKeys("manoja"+gen()+gen1());
driver.findElement(webdriver.By.xpath("//input[@name='owningIndividual.lastName']")).sendKeys("manoja"+gen()+gen1());
driver.findElement(webdriver.By.xpath(".//span[.='Date of birth']/..//input[@name='date']")).sendKeys("21");
driver.findElement(webdriver.By.xpath(".//span[.='Date of birth']/..//input[@name='months']")).sendKeys("02");
driver.findElement(webdriver.By.xpath("//span[.='Date of birth']/..//input[@name='years']")).sendKeys("1980");
driver.findElement(webdriver.By.xpath("(.//input[@type='tel'])")).sendKeys("032323232323");
driver.findElement(webdriver.By.xpath("(.//input[@type='email'])")).sendKeys("manoj"+gen()+"su"+gen1()+"@amdocs.com");

driver.findElement(webdriver.By.xpath("(.//span[@class='ds-form__text'][text()='Email'])")).click();

await commands.wait.byTime(5000)

selectElem = driver.findElement(webdriver.By.xpath("/html/body/section/div[1]/div[1]/div[5]/div[1]/div/section/div/div/section[2]/fieldset/div/div[1]/div/select"));
selectElem.findElement(webdriver.By.xpath("/html/body/section/div[1]/div[1]/div[5]/div[1]/div/section/div/div/section[2]/fieldset/div/div[1]/div/select/option[3]")).click();

 

driver.findElement(webdriver.By.name("owningIndividual.identification.identificationNumber")).sendKeys(gen()+gen1());

driver.findElement(webdriver.By.name("owningIndividual.identification.issuerName")).sendKeys("amdocsd");
await commands.wait.byTime(5000)
driver.findElement(webdriver.By.xpath("(//span[.='Expiration Date']/..//input[@name='date'])")).sendKeys("21");
driver.findElement(webdriver.By.xpath("(//span[.='Expiration Date']/..//input[@name='months'])")).sendKeys("02");
driver.findElement(webdriver.By.xpath("(//span[.='Expiration Date']/..//input[@name='years'])")).sendKeys("2020");
await commands.wait.byTime(5000)
driver.findElement(webdriver.By.xpath("(.//span[contains(., 'Issued')]/..//input[@name='date'])")).sendKeys("21");
driver.findElement(webdriver.By.xpath("(.//span[contains(., 'Issued')]/..//input[@name='months'])")).sendKeys("02");
driver.findElement(webdriver.By.xpath("(.//span[contains(., 'Issued')]/..//input[@name='years'])")).sendKeys("2018");
await commands.wait.byTime(5000)

var fileInput = driver.findElement(webdriver.By.xpath('/html/body/section/div[1]/div[1]/div[5]/div[1]/div/section/div/div/section[2]/fieldset/div/div[6]/div/div[2]/div[4]/label/input'));
var path = process.cwd()+'/attch.png';
fileInput.sendKeys(path);
await commands.wait.byTime(5000)
driver.findElement(webdriver.By.name("address.addressLine1")).sendKeys("pune");
await commands.wait.byTime(5000)
driver.findElement(webdriver.By.xpath("/html/body/section/div[1]/div[1]/div[5]/div[1]/div/section/div/div/fieldset/div/div/section/div[2]/fieldset/div/div[1]/div/div[2]/ul/li/div")).click();
//driver.findElement(webdriver.By.name("address.addressLine2")).sendKeys("hadapsar");
//driver.findElement(webdriver.By.name("address.addressLine3")).sendKeys("pune");
//driver.findElement(webdriver.By.name("address.city")).sendKeys("pune");




//selectElement = driver.findElement(webdriver.By.xpath("/html/body/section/div[1]/div[1]/div[5]/div[1]/div/section/div/div/fieldset/div/section/div[2]/fieldset/div/div[5]/div/select"));
//selectElement.findElement(webdriver.By.xpath("/html/body/section/div[1]/div[1]/div[5]/div[1]/div/section/div/div/fieldset/div/section/div[2]/fieldset/div/div[5]/div/select/option[11]")).click();


//driver.findElement(webdriver.By.name("address.postalCode")).sendKeys("411011");

//driver.findElement(webdriver.By.xpath("(.//span[@class='ds-on'])")).click();
driver.findElement(webdriver.By.xpath("//button[@class='ds-btn ds-btn--primary']/span")).click();
await commands.wait.byTime(10000)
//await commands.click.byXpathAndWait('/html/body/section/div[1]/div[2]/div/div[2]/button/span');

await commands.wait.byTime(12000)
await commands.wait.byXpath('/html/body/section/div[1]/div[2]/div/div[2]/button/span', 10000);

await commands.measure.stop();

await commands.measure.start('ordersummary');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[2]/div/div[2]/button/span')
//await commands.wait.byXpath('/html/body/section/div[1]/div[1]/div[4]/div/div/footer/button/span', 12000)

await commands.measure.stop();



await commands.measure.start('orderConfirmation');
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/div/div[2]/div[1]/div[3]/form/fieldset/div/div/div[1]/label/div/span[1]')
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/div/div[2]/div[1]/div[4]/form/fieldset/div/div/div[1]/label/div/span[2]')
await commands.wait.byTime(3000)
await commands.click.byXpathAndWait('/html/body/section/div[1]/div[1]/div[4]/div/div/div[2]/footer/button/span')

await commands.measure.stop();



await commands.measure.stop();

return commands.measure.stop();
};
