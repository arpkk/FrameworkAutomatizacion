#!/bin/bash
echo 'Subiendo archivo'
if [[ $TAG =~ [','] ]]; then
export TAG=${TAG//,/ or }
echo "adentro del if" $TAG
fi
