<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Order' }" />
        <VerticalNavLink
            :item="{
                title: 'Order',
                to: '/orders',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Delivery' }" />
        <VerticalNavLink
            :item="{
                title: 'Delivery',
                to: '/deliveries',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Product' }" />
        <VerticalNavLink
            :item="{
                title: 'Inventory',
                to: '/inventories',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'SearchProduct',
                to: '/searchProducts',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Customercenter' }" />
        <VerticalNavLink
            :item="{
                title: 'MyPage',
                to: '/myPages',
            }"
        />
    </ul>
</template>
