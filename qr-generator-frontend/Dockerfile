# Stage 1: Build Angular app
FROM node:22 AS build
WORKDIR /app

# Copiar package.json y package-lock.json para instalar dependencias
COPY package*.json ./
RUN npm install

# Copiar el resto del código fuente
COPY . .

# Compilar la app para producción
RUN npm run build -- --output-path=dist --configuration=production

# Stage 2: Servir la app con Nginx
FROM nginx:stable-alpine

# Copiar los archivos compilados al directorio de Nginx
COPY --from=build /app/dist/browser /usr/share/nginx/html/

# Exponer el puerto de Nginx
EXPOSE 80

# Comando por defecto para Nginx
CMD ["nginx", "-g", "daemon off;"]
