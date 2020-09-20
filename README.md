# COSC499-Team-Git
### Description 
This project analyzes the contents of a text file and displays all results of the analysis to the console.

### Features
- Feature 1 (Alex): count number of words in text file
- Feature 2 (Jeff): count number of vowels in text file
- Feature 3 (Parsa): count number of characters
- Feature 4 (Rachelle): estimate time to read aloud (given average words per minute is 130)

### Set-up Instructions
1. navigate to desired file location and clone the repository. I would recommend setting up a dev folder where all coding projects can go
	git clone https://github.com/Parsa-Rajabi/COSC499-Team-Git.git
2. navigate into repository and pull its contents to make sure you have everything
	cd COSC499-Team-Git
	git pull
3. now that the project is on your computer locally, open in it in an IDE of your choice
4. to test that the project runs correctly, print out the value of the variable text right below fileAnalysis/AnalyzeFile.java:10
5. run the file AnalyzeFile.java to make sure that it works

### Project Structure
In this project I have included three packages: `fileAnalysis`, `resources`, `tests`
- `fileAnalysis` will be where all of the classes associated with our features will go. To reduce the number of merge-conflicts, create a sepearate file for each feature (ex. CountWords.java)
- `resources` is where all text files  and non-code files will go. If you add additional text files, add them here.
- `tests` is where all of the JUnit tests will go. For each feature, please add at least one JUnit test (more may be required though depending on the number of cases your function may have)

### Version Control & Branching
While developing, we will be working off of the branch named develop instead of master. 

We will be following the branch naming convention of `feature/<name-of-feature>`

After you have completed your code, but before you add and commit a pull request, make sure that you have the latest work from develop. This can be done by doing the following:

`git stash // this saves all of your work to the stash and removes your changes from your local version`

`git pull --rebase origin develop	// this is going to get all the latest changes from develop. It is a good idea to get in the habit of rebasing (instead of merging)`

`git stash apply 	// reapply your changes that you stashed`



