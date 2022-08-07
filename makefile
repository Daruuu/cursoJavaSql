NOWTIME="$(date +"%T")"
rungit:
	git status
	git add .
	git commit -m "automate-commit $NOWTIME"
	git push origin main
