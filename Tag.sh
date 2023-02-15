#!/bin/bash
echo 'Subiendo archivo'
echo $TAG
if [[ $TAG =~ [','] ]]; then
export TAG=${TAG//,/ or }
echo "adentro del if" $TAG
fi
