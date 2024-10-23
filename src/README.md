# Preseason Digital Notebook Example
Name: Melody Sackman

Section: I2RC

Week: 7


## Code

The main topic this week was: TeleOp

Commands: TeleOp.java (in the TeleOp branch)

Subsystems: DriveTrain

### How does the code work?
Write about how it works here
The code first creates a joystick object so we can set it up to control the robot later. A DriveTrain object, dt, is also created, which represents the robot. TeleOp.java uses the same skeleton as the Encoder and PID code, therefore it has the initialize, execute, end, and isFinished methods. The initialize and end methods are the same, and only stop the robot's motion by setting tankDrive to 0. In the execute method, the leftPowerRaw and rightPowerRaw variables are created to track the joystick movement. The getRawAxis is set to 1 for the left, and 5 for the right. This way, the robot will respond to how far we push the joystick, and adjust its speed based off of it. For example, if I push the joystick a little forward, the robot will move slowly in that direction. If I push it further however, it will go faster. Since we want the robot to only move when the joysticks are being used, the isFinished method returns false. 

### Important notes for future reference
Notes about git, and helpful resources, etc. 

Please put them here, they will really help you in the future 



---------------------------------------------------------------------------
# Preseason Digital Notebook Example
Name: Melody Sackman

Section: I2RC


Week: 6



## Code


The main topic this week was: PID control algorithm 

Commands: PIDTurnccw.java

Subsystems: RobotContainer.java

### How does the code work?
Write about how it works here
The code creates a PID controller object, so that when we control the robot, we can use PID to adjust control of the robot automatically. This can save us time trying to adjust movement manually. In the constructor, after the initial variables are set to the parameters, the setTolerance() method is called on the PID object to allow room for error. The tolerance is set at 5, so the setpoint can be from, for example, 45-55 if the desired setpoint is 50. The methods initialize, end, and isFinished have the same code as the ones in the Encoder lab. This allows it to reset the NavX/prevent the robot from moving once called, put the robot to a stop, and checking if the set point has been reached respectively. The execute method, however, checks if the output is negative or positive. If it is negative, it turns clockwise by setting the speed of the left wheels (leftSpeed) negative and the speed of the right wheels (rightSpeed) positive. The code does the opposite if the output is postive, and the robot will move clockwise instead. 

### Dudley's Fundraiser Elevator Speech
"Hi, I just wanted to let you know my Robotics group Option 16 is holding a fundraiser with Dudley's bakery, and I was wondering if you would be interested in ordering something there. Our fundraiser allows you to order online any bread, pies, or other baked goods Dudley's has to offer. These fundraisers helps our team host outreach and mentoring programs, and this one is currently the biggest fundraiser our team has this year. The order and payment is due on November 1st, and our team will get all the orders shipped to Westview to be picked up. All orders will be picked up on November 15th, and I will be able to bring it directly to you."
I asked:
    - Mrs. Reigle 
    - Three friends (one confirmed)


### Important notes for future reference
Notes about git, and helpful resources, etc. 
Please put them here, they will really help you in the future 
Remember to create a repository for each week with the W# and name of the lab we are working on
    - If you want to access previous code from other labs (that you worked on in a different repository), make sure to switch to its respective repository to edit the code. You can still look at the code without doing this, though
    - Remember to refer to the Command Composition page in the FIRST Robotics Competition link (linked in slack) when coding in labs or on the robot



