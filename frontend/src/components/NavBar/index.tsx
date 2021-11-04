import imgDsDark from 'assets/img/ds-dark.svg';

const NavBar = () => {
    return (
      <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadom-sm">
        <div className="container">
            <nav className="my-2 my-md-0 mr-md-3">
                <img src={imgDsDark} alt="devSuperior" width="120"></img>
            </nav>
        </div>
      </div>
    );
  }
  
  export default NavBar;
  