include $(call first-makefiles-under,$(LOCAL_PATH))

PRODUCT_COPY_FILES += \
    device/oneplus/instantnoodle/cup/custom/Lawnchair/etc/permissions/privapp-permissions-app.lawnchair.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/permissions/privapp-permissions-app.lawnchair.xml \
    device/oneplus/instantnoodle/cup/custom/Lawnchair/etc/sysconfig/app.lawnchair-hiddenapi-package-whitelist.xml:$(TARGET_COPY_OUT_SYSTEM)/etc/sysconfig/app.lawnchair-hiddenapi-package-whitelist.xml \
    device/oneplus/instantnoodle/cup/custom/Lawnchair/priv-app/LawnchairAlpha/lib/arm64/libnrb.so:$(TARGET_COPY_OUT_SYSTEM)/priv-app/LawnchairAlpha/lib/arm64/libnrb.so

PRODUCT_PACKAGES += \
QuickstepSwitcherOverlay\
LawnchairAlpha
