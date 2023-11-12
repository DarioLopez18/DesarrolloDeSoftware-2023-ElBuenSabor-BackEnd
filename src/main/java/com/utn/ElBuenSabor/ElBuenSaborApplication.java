package com.utn.ElBuenSabor;

import com.utn.ElBuenSabor.entities.*;
import com.utn.ElBuenSabor.enums.*;
import com.utn.ElBuenSabor.repositories.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;

@SpringBootApplication
public class ElBuenSaborApplication {

	@Autowired
	public DomicilioRepository domicilioRepository;
	@Autowired
	public PersonaRepository personaRepository;
	@Autowired
	public UsuarioRepository usuarioRepository;
	@Autowired
	public ArticuloManufacturadoRepository articuloManufacturadoRepository;
	@Autowired
	public UnidadMedidaRepository unidadMedidaRepository;
	@Autowired
	public ArticuloInsumoRepository articuloInsumoRepository;
	@Autowired
	public RubroArticuloManufacturadoRepository rubroArticuloRepository;
	@Autowired
	public RubroArticuloInsumoRepository recetaArticuloInsumoRepository;
	@Autowired
	public RecetaRepository recetaRepository;

	@Autowired
	public DetalleArticuloManufacturadoRepository detalleArticuloManufacturadoRepository;

	@Autowired
	public DetallePedidoRepository detallePedidoRepository;

	@Autowired
	public CarritoProductoRepository carritoProductoRepository;

	@Autowired
	public CarritoRepository carritoRepository;
	public static void main(String[] args) {
		SpringApplication.run(ElBuenSaborApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepository usuarioRepo, PersonaRepository clienteRepo, DomicilioRepository domicilioRepo ) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

			Date fechaActual = new Date();
			TimeZone timeZone = TimeZone.getDefault();

			//Crea usuarios
			Usuario usuario1 = Usuario.builder()
					.auth0Id("auth0Id123")
					.username("username123")
					.password("123")
					.rol(Rol.CLIENTE)
					.build();
			usuario1.setSubmissionDateAlta(fechaActual);
			usuarioRepository.save(usuario1);

			Usuario usuario2 = Usuario.builder()
					.auth0Id("auth0Id1234")
					.username("username1234")
					.password("123")
					.rol(Rol.ADMINISTRADOR)
					.build();
			usuario2.setSubmissionDateAlta(fechaActual);
			usuarioRepository.save(usuario2);

			Usuario usuario3 = Usuario.builder()
					.auth0Id("auth0Id12345")
					.username("username12345")
					.password("123")
					.rol(Rol.COCINERO)
					.build();
			usuario3.setSubmissionDateAlta(fechaActual);
			usuarioRepository.save(usuario3);

			Usuario usuario4 = Usuario.builder()
					.auth0Id("auth0Id123456")
					.username("username123456")
					.password("123")
					.rol(Rol.DELIVERY)
					.build();
			usuario4.setSubmissionDateAlta(fechaActual);

			//Crea y agrega domicilios al cliente asociado a este usuario
			Persona cliente1 = Persona.builder()
					.apellido("Apellido")
					.email("cliente@example.com")
					.nombre("Nombre")
					.telefono("123-456-7890")
					.domicilios(List.of(
							Domicilio.builder()
									.calle("Calle 1")
									.codigoPostal(12345)
									.localidad("Ciudad 1")
									.numero(123)
									.numeroDpto(1)
									.pisoDpto(2)
									.build(),
							Domicilio.builder()
									.calle("Calle 2")
									.codigoPostal(54321)
									.localidad("Ciudad 2")
									.numero(456)
									.numeroDpto(3)
									.pisoDpto(4)
									.build()
					))

					.usuario(usuario4)
					.build();
			cliente1.setSubmissionDateAlta(fechaActual);
			personaRepository.save(cliente1);

			ArticuloManufacturado articuloManufacturado1 = ArticuloManufacturado.builder()
					.costo(BigDecimal.valueOf(10.20))
					.denominacion("Pizza")
					.descripcion("Pizza con cebolla")
					.precioVenta(BigDecimal.valueOf(15.20))
					.categoria(CategoriaProducto.PIZZA)
					.urlImagen("URLPizza")

					.build();
			articuloManufacturado1.setSubmissionDateAlta(fechaActual);
			articuloManufacturadoRepository.save(articuloManufacturado1);

			UnidadMedida unidadMedidaKg = UnidadMedida.builder()
					.abreviatura("kg")
					.denominacion("Kilogramo")
					.build();

			unidadMedidaRepository.save(unidadMedidaKg);

			RubroArticuloManufacturado rubroArticuloHamburguesa = RubroArticuloManufacturado.builder()
					.denominacion("Hamburguesa")
					.rubroPadre(null)
					.build();
			rubroArticuloHamburguesa.setSubmissionDateAlta(fechaActual);
			rubroArticuloRepository.save((rubroArticuloHamburguesa));

			ArticuloInsumo articuloInsumoHarina = ArticuloInsumo.builder()
					.denominacion("Harina")
					.precioCompra(BigDecimal.valueOf(15.00))
					.stockActual(BigDecimal.valueOf(20.00))
					.stockMinimo(BigDecimal.valueOf(10.00))
					.urlImagen(null)
					.unidadMedida(unidadMedidaKg)
					//rubroArticulo(rubroArticuloHamburguesa)
					.build();
			articuloInsumoHarina.setSubmissionDateAlta(fechaActual);
			articuloInsumoRepository.save(articuloInsumoHarina);

			RubroArticuloInsumo recetaArticuloInsumoMasaHamburguesa = RubroArticuloInsumo.builder()
					.denominacion("Masa Hamburguesa")
					.build();
			recetaArticuloInsumoMasaHamburguesa.setSubmissionDateAlta(fechaActual);
			recetaArticuloInsumoRepository.save(recetaArticuloInsumoMasaHamburguesa);

			Receta recetaMasaHamburguesa = Receta.builder()
					.nombreReceta("MasapPizza")
					.descripcionReceta("Mezclar todos los ingredientes")
					.tiempoPreparacion(10)
					.build();
			recetaMasaHamburguesa.setSubmissionDateAlta(fechaActual);
			recetaRepository.save(recetaMasaHamburguesa);

			DetalleArticuloManufacturado detalleArticuloManufacturado = DetalleArticuloManufacturado.builder()
					.cantidad(BigDecimal.valueOf(3.0))
					.articuloInsumo(articuloInsumoHarina)
					.build();
			detalleArticuloManufacturado.setSubmissionDateAlta(fechaActual);
			detalleArticuloManufacturadoRepository.save(detalleArticuloManufacturado);

			DetallePedido detallePedido = DetallePedido.builder()
					.cantidad(3)
					.subtotal(BigDecimal.valueOf(3.0))
					.subtotalCosto(BigDecimal.valueOf(15.0))
					.articuloManufacturado(articuloManufacturado1)
					.build();
			detallePedido.setSubmissionDateAlta(fechaActual);
			detallePedidoRepository.save(detallePedido);


			Carrito carrito1 = Carrito.builder()
					.numeroCarrito(1)
					.carritoProductos(List.of(
							CarritoProducto.builder()
								.cantidadProductoCarrito(1)
								.numeroLinea(12)
								.articuloManufacturado(articuloManufacturado1)
								.build()
					)).build();
					carrito1.setFechaCreacionCarrito(fechaActual);
			carritoRepository.save(carrito1);

			
		};


	}
}
