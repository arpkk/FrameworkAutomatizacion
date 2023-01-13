#!/bin/bash
echo $IR

curl --location --request POST 'https://pruebaqmetry.atlassian.net/rest/api/3/issue/'$IR'/attachments' \
		--header 'Authorization: Basic Z2luYS5vemltaXNhQHRzb2Z0Z2xvYmFsLmNvbTpQclRkRkdiNmxvMEtLQXk5Rzd0cTI2NkM=' \
		--header 'Content-Type: multipart/form-data' \
		--header 'Cookie: atlassian.xsrf.token=5d3b4c67-268c-48e9-b2df-7d68175487ac_e9b0ba25c6a3ddeafd00fc4e74c28c189aac7608_lin' \
		--header 'X-Atlassian-Token: no-check' \
		--header 'Accept: application/json' \
		--form 'file=@"'$WORKSPACE'/results/reporteQA.pdf"'
