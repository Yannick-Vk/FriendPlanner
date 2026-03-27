<script setup lang="ts">
import { ref } from 'vue'
import { Slider } from '@ark-ui/vue/slider'

const sliderValue = ref([40])
</script>

<template>
  <div class="p-4">
    <h1 class="text-2xl font-bold mb-4">Welcome to FriendPlanner!</h1>
    <p class="mb-4 text-red-500">Below is an example of an Ark UI Slider component:</p>

    <Slider.Root :min="0" :max="100" v-model="sliderValue" class="w-80 max-w-xs">
      <div class="flex justify-between mb-2">
        <Slider.Label class="text-lg font-medium">Label</Slider.Label>
        <Slider.ValueText class="text-lg font-medium" />
      </div>
      <Slider.Control class="relative flex items-center h-5 pr-2">
        <Slider.Track class="bg-gray-300 h-1 grow rounded-full">
          <Slider.Range class="bg-blue-500 h-full rounded-full" />
        </Slider.Track>
        <Slider.Thumb :index="0" class="w-4.5 h-4.5 bg-white rounded-full shadow border
        border-gray-400 cursor-pointer absolute  focus-visible:outline-none focus-visible:outline-blue-500
        focus-visible:outline-2 focus-visible:outline-offset-2" />
      </Slider.Control>
    </Slider.Root>
  </div>
</template>

<style scoped>
/* Scoped styles can still be used for more specific styling if needed, */
/* but Tailwind classes are preferred for consistency. */

/* Example: Styling a component based on a data attribute if not handled by Tailwind variants */
[data-scope='slider'][data-part='root'] {
   display: flex;
   flex-direction: column;
}
</style>
