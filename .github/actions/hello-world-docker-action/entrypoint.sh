#!/bin/sh -l

echo "Hello $1"
echo "::set-output name=time::$(date)"
