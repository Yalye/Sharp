
### parse html
class selector:  .class_name




chrome_driver.find_elements(By.CSS_SELECTOR, value=".info")[0].find_element(By.CSS_SELECTOR, value=".name")

chrome_driver.find_elements_by_xpath("//div[@class='info']")[0].find_element_by_xpath("./div[@class='name']/a[@href]").get_attribute("href")


### Ref
[https://jsoup.org/cookbook/extracting-data/attributes-text-html](https://jsoup.org/cookbook/extracting-data/attributes-text-html)