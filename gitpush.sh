#!/bin/bash
#script to automate my git push in every git repository
git add .
	echo "Enter the commit message:"
read COMMITMESSAGE
git commit -m "$COMMITMESSAGE"
	echo  "enter the name of branch:"
read BRANCH
git push origin $BRANCH
read
	echo "REPOSITORY UPDATED SUCCESFUL!!"
