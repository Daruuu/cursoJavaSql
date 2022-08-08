rungit:
	NOWTIME="$(date +"%T")"
	git status
	git add .
	git commit -m "automate-commit ($NOWTIME)"
	git push origin main
