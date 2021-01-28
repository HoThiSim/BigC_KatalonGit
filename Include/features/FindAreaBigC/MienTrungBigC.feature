
@tag
Feature: FindArea
  I want to use this template for my feature file

   @tag1
	 Scenario Outline: Title of your scenario outline
	 Given Usser navigate Big C hompage
   When Click Login button in Homepage
   And Input username <usernamefind> and password <passwordfind> to Login
   And Click Submit button to Login
   And Click Find Market button
   And Click Mien Trung tag
   Then I verify the <title> and <description> in step

   Examples:
     |usernamefind |passwordfind|title |description|
     |sim.ho21@student.passerellesnumeriques.org |NaFUB8oFyj+OWAgcwJhycg==|Big C ĐÀ NẴNG|Khu thương Mại Vĩnh Trung, 255-257 Hùng Vương, Quận Thanh Khê, TP. Đà Nẵng|
