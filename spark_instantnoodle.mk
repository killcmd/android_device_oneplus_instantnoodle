#
# Copyright (C) 2018-2022 The LineageOS Project
# Copyright (C) 2019-2022 The Evolution X Project
#
# SPDX-License-Identifier: Apache-2.0
#
SAUCE := SPARK
# Inherit from those products. Most specific first.
$(call inherit-product, $(SRC_TARGET_DIR)/product/core_64_bit.mk)
$(call inherit-product, $(SRC_TARGET_DIR)/product/full_base_telephony.mk)

# Inherit from instantnoodle device
$(call inherit-product, device/oneplus/instantnoodle/device.mk)

# Inherit some common 3rd party stuff.
$(call inherit-product, vendor/spark/config/common_full_phone.mk)

# Inherit DM stuff.
$(call inherit-product, device/oneplus/instantnoodle/cup/vars.mk)

PRODUCT_NAME := spark_instantnoodle
PRODUCT_DEVICE := instantnoodle
PRODUCT_MANUFACTURER := OnePlus
PRODUCT_BRAND := OnePlus
PRODUCT_MODEL := IN2015

PRODUCT_GMS_CLIENTID_BASE := android-oneplus

PRODUCT_BUILD_PROP_OVERRIDES += \
    PRIVATE_BUILD_DESC="OnePlus8-user 12 RKQ1.211119.001 Q.202206110134 release-keys"

BUILD_FINGERPRINT := OnePlus/OnePlus8/OnePlus8:12/RKQ1.211119.001/Q.202206110134:user/release-keys
