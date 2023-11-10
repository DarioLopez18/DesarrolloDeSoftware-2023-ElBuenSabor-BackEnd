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

@SpringBootApplication
public class ElBuenSaborApplication {

	@Autowired
	public DomicilioRepository domicilioRepository;
	@Autowired
	public ClienteRepository clienteRepository;
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
	public static void main(String[] args) {
		SpringApplication.run(ElBuenSaborApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepository usuarioRepo, ClienteRepository clienteRepo, DomicilioRepository domicilioRepo ) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

			SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
			String fechaString = "2023-09-09";
			Date fecha = formatoFecha.parse(fechaString);

			//Crea User
			Usuario user1 = Usuario.builder()
					.auth0Id("auth0Id123")
					.username("username123")
					.rol(Rol.CLIENTE)
					.build();
			//guardar user
			usuarioRepository.save(user1);

			//Crea User
			Usuario user2 = Usuario.builder()
					.auth0Id("auth0Id1234")
					.username("username1234")
					.rol(Rol.ADMINISTRADOR)
					.build();
			//guardar user
			usuarioRepository.save(user2);

			//Crea User
			Usuario user3 = Usuario.builder()
					.auth0Id("auth0Id12345")
					.username("username12345")
					.rol(Rol.COCINERO)
					.build();
			//guardar user
			usuarioRepository.save(user3);

			//Crea User
			Usuario user4 = Usuario.builder()
					.auth0Id("auth0Id123456")
					.username("username123456")
					.rol(Rol.DELIVERY)
					.build();
			//guardar user
			usuarioRepository.save(user4);

			//Crea y agrega domicilios al cliente asociado a este usuario
			Cliente cliente1 = Cliente.builder()
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
					.fechaAlta(new Date())
					.usuario(user1) // Asociar el cliente con el usuario
					.build();
			//guardar cliente
			clienteRepository.save(cliente1);

			ArticuloManufacturado articuloManufacturado1 = ArticuloManufacturado.builder()
					.costo(BigDecimal.valueOf(10.20))
					.denominacion("Pizza")
					.descripcion("Pizza con cebolla")
					.fechaAlta(new Date())
					.fechaBaja(null)
					.fechaModificacion(null)
					.precioVenta(BigDecimal.valueOf(15.20))
					.categoria(CategoriaProducto.PIZZA)
					.urlImagen("URLPizza")

					.build();

			articuloManufacturadoRepository.save(articuloManufacturado1);

			UnidadMedida unidadMedidaKg = UnidadMedida.builder()
					.abreviatura("kg")
					.denominacion("Kilogramo")
					.fechaAlta(new Date())
					.fechaBaja(null)
					.fechaModificacion(null)

					.build();

			unidadMedidaRepository.save(unidadMedidaKg);

			RubroArticuloManufacturado rubroArticuloHarina = RubroArticuloManufacturado.builder()
					.denominacion("Harina")
					.fechaAlta(new Date())
					.fechaBaja(null)
					.fechaModificacion(null)
					.rubroPadre(null)
					.subRubros(null)
					.build();
			rubroArticuloRepository.save((rubroArticuloHarina));

			ArticuloInsumo articuloInsumoHarina = ArticuloInsumo.builder()
					.denominacion("Harina")
					.fechaAlta(new Date())
					.fechaBaja(null)
					.fechaModificacion(null)
					.precioCompra(BigDecimal.valueOf(15.00))
					.stockActual(BigDecimal.valueOf(20.00))
					.stockMinimo(BigDecimal.valueOf(10.00))
					.urlImagen(null)
					.unidadMedida(unidadMedidaKg)
					.rubroArticulo(rubroArticuloHarina)
					.build();
			articuloInsumoRepository.save(articuloInsumoHarina);
			RubroArticuloInsumo recetaArticuloInsumoMasaPizza = RubroArticuloInsumo.builder()
					.cantidad(1)
					.articuloInsumo(articuloInsumoHarina)
					.build();
			recetaArticuloInsumoRepository.save(recetaArticuloInsumoMasaPizza);

			Receta recetaMasaPizza = Receta.builder()
					.nombreReceta("MasapPizza")
					.procedimientoReceta("Mezclar todos los ingredientes")
					.recetaArticuloInsumos(null)
					.tiempoPreparacion(10)
					.build();
			recetaRepository.save(recetaMasaPizza);
		};



	}
}
