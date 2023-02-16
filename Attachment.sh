#!/bin/bash
echo $IR

	curl --location --request POST 'https://bootcamp-devops.atlassian.net/rest/api/3/issue/'$IR'/attachments' \
	--header 'Authorization: Basic Z2luYS5vemltaXNhQHRzb2Z0Z2xvYmFsLmNvbTpBVEFUVDN4RmZHRjBMOHBCaTVxS2NqamdINTdXVHRPNV9LRkhmWW9qVWotemRzMVlpWGg5Vjk3UXFFeExlS3prT2Vpcmc1WmpNbmRDZHJRRU5EU2NnWDM5S3E1N01vM1ZhdWF5bHdqeW10aWNhQ2JqMVFTZDFVZ2VoTUJRMTJEV1hNaWJZXzA5cW5wbmQ0Qm9JTUJ0MVFQNGxWWnptTWtwT0JGQ2w2ZjJwNlc0SWlrd2JKRGJ3b2s9RTZCQkUyMzI=' \
	--header 'X-Atlassian-Token: no-check' \
	--header 'Content-Type: multipart/form-data' \
	--header 'Accept: application/json' \
	--header 'Cookie: atlassian.xsrf.token=cec63393-9b34-46a4-a1d0-4e6984c71182_c09262cb32fc58415f510f533ac342bc22671b63_lin' \
	--form 'file=@"'$WORKSPACE'/results/reporteQA.pdf"'
	
