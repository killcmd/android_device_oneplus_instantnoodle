#!/bin/bash
echo "Fetching the big files..."
## Paths
# $ANDROID_BUILD_TOP/device/oneplus/instantnoodle/cup/needed
# $ANDROID_BUILD_TOP/device/oneplus/instantnoodle/cup/custom

wget -O "$PWD/device/oneplus/instantnoodle/cup/needed/GoogleCamera/GoogleCamera.apk" https://gitlab.com/killcmd/googlecamera/-/raw/main/GCAM.apk?inline=false